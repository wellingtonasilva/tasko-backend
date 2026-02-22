#!/bin/bash

# Tasko Backend - Build and Deploy Script
# This script helps with building and deploying the application

set -e

# Colors for output
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
NC='\033[0m' # No Color

# Function to print colored output
print_success() {
    echo -e "${GREEN}✓ $1${NC}"
}

print_error() {
    echo -e "${RED}✗ $1${NC}"
}

print_info() {
    echo -e "${YELLOW}ℹ $1${NC}"
}

# Function to display usage
usage() {
    echo "Usage: $0 [COMMAND]"
    echo ""
    echo "Commands:"
    echo "  build           Build the Docker image"
    echo "  run             Run the application with docker-compose"
    echo "  stop            Stop the running containers"
    echo "  clean           Remove containers, images, and volumes"
    echo "  test            Test the Docker build"
    echo "  push            Build and push to Docker registry"
    echo "  logs            Show application logs"
    echo "  help            Show this help message"
    echo ""
    exit 1
}

# Function to build Docker image
build_image() {
    print_info "Building Docker image..."
    docker build -t tasko-backend:latest .
    print_success "Docker image built successfully!"
}

# Function to run with docker-compose
run_compose() {
    print_info "Starting application with docker-compose..."
    docker-compose up -d
    print_success "Application started successfully!"
    print_info "Access the application at: http://localhost:8080"
    print_info "Health check: http://localhost:8080/actuator/health"
}

# Function to stop containers
stop_containers() {
    print_info "Stopping containers..."
    docker-compose down
    print_success "Containers stopped successfully!"
}

# Function to clean up
clean_all() {
    print_info "Cleaning up containers, images, and volumes..."
    docker-compose down -v
    docker rmi tasko-backend:latest 2>/dev/null || true
    docker rmi tasko-backend:test 2>/dev/null || true
    print_success "Cleanup completed!"
}

# Function to test build
test_build() {
    print_info "Testing Docker build..."
    docker build -t tasko-backend:test .
    print_success "Build test successful!"

    print_info "Checking image size..."
    docker images tasko-backend:test --format "Size: {{.Size}}"
}

# Function to push to registry
push_image() {
    if [ -z "$1" ]; then
        print_error "Docker registry not specified!"
        echo "Usage: $0 push <registry/repository:tag>"
        exit 1
    fi

    REGISTRY_IMAGE=$1

    print_info "Building and pushing image to $REGISTRY_IMAGE..."
    docker build -t $REGISTRY_IMAGE .
    docker push $REGISTRY_IMAGE
    print_success "Image pushed successfully!"
}

# Function to show logs
show_logs() {
    print_info "Showing application logs..."
    docker-compose logs -f app
}

# Main script logic
case "${1}" in
    build)
        build_image
        ;;
    run)
        run_compose
        ;;
    stop)
        stop_containers
        ;;
    clean)
        clean_all
        ;;
    test)
        test_build
        ;;
    push)
        push_image "${2}"
        ;;
    logs)
        show_logs
        ;;
    help|*)
        usage
        ;;
esac


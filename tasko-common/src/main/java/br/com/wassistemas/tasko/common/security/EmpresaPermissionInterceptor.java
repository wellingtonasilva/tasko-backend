package br.com.wassistemas.tasko.common.security;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Interceptor para validar permissao de empresa em endpoints multi-tenant.
 */
@Component
public class EmpresaPermissionInterceptor implements HandlerInterceptor {

    private final JwtTokenProvider jwtTokenProvider;

    @Autowired
    public EmpresaPermissionInterceptor(JwtTokenProvider jwtTokenProvider) {
        this.jwtTokenProvider = jwtTokenProvider;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String empresaIdHeader = request.getHeader("X-Empresa-Id");
        if (empresaIdHeader != null) {
            Long empresaId = Long.valueOf(empresaIdHeader);
            JwtUtil.validarPermissaoEmpresa(request, jwtTokenProvider, empresaId);
            return true;
        }
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        return false;
    }
}

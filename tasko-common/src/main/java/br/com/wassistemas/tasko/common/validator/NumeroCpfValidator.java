package br.com.wassistemas.tasko.common.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumeroCpfValidator implements ConstraintValidator<NumeroCpf, String> {
    private static final Pattern PATTERN = Pattern.compile("\\d+");

    @Override
    public void initialize(NumeroCpf constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String numeroCpf, ConstraintValidatorContext constraintValidatorContext) {
        Matcher matcher = PATTERN.matcher(numeroCpf);
        StringBuilder numeroCpfSemMascara = matcher
                .results()
                .map(MatchResult::group)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);

        return isCpfValido(numeroCpfSemMascara.toString());
    }

    private boolean isCpfValido(String numeroCpf) {
        if (numeroCpf.equals("00000000000") ||
                numeroCpf.equals("11111111111") ||
                numeroCpf.equals("22222222222") || numeroCpf.equals("33333333333") ||
                numeroCpf.equals("44444444444") || numeroCpf.equals("55555555555") ||
                numeroCpf.equals("66666666666") || numeroCpf.equals("77777777777") ||
                numeroCpf.equals("88888888888") || numeroCpf.equals("99999999999") ||
                (numeroCpf.length() != 11))
        {
            return false;
        }

        char digito10 = calculoDigito10(numeroCpf);
        char digito11 = calculoDigito11(numeroCpf);

        return ((digito10 == numeroCpf.charAt(9)) && (digito11 == numeroCpf.charAt(10)));
    }

    private char calculoDigito10(String numeroCpf) {
        int soma = 0;
        int peso = 10;
        int numero = 0;
        int resultado = 0;

        for (int i = 0; i < 9; i++) {
            numero = numeroCpf.charAt(i) - 48;
            soma = soma + (numero * peso);
            peso = peso - 1;
        }

        resultado = 11 - (soma % 11);
        if ((resultado == 10) || (resultado == 11)) {
            return '0';
        }

        return (char)(resultado + 48);
    }

    private char calculoDigito11(String numeroCpf) {
        int soma = 0;
        int peso = 11;
        int numero = 0;
        int resultado = 0;

        for(int i = 0; i < 10; i++) {
            numero = numeroCpf.charAt(i) - 48;
            soma = soma + (numero * peso);
            peso = peso - 1;
        }

        resultado = 11 - (soma % 11);
        if ((resultado == 10) || (resultado == 11)) {
            return '0';
        }

        return (char)(resultado + 48);
    }
}

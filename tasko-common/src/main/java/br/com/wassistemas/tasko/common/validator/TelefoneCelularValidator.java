package br.com.wassistemas.tasko.common.validator;

import br.com.wassistemas.tasko.common.enumerations.TipoTelefoneBrasileiro;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// https://www.anatel.gov.br/setorregulado/plano-de-numeracao-brasileiro
// https://www.anatel.gov.br/setorregulado/plano-de-numeracao-brasileiro?id=330
// NÚMERO DO ASSINANTE: 9XXXX-XXXX

// https://www.anatel.gov.br/setorregulado/plano-de-numeracao-brasileiro?id=331
// NÚMERO DO ASSINANTE: 2XXX-XXXX; 3XXX-XXXX; 4XXX-XXXX; 5XXX-XXXX
public class TelefoneCelularValidator implements ConstraintValidator<TelefoneCelular, String> {

    private static final int MAX_NUMBER_MOBILE_PHONE = 11;
    private static final Pattern PATTERN = Pattern.compile("\\d+");

    @Override
    public void initialize(TelefoneCelular constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String numeroTelefone, ConstraintValidatorContext constraintValidatorContext) {
        Matcher matcher = PATTERN.matcher(numeroTelefone);
        StringBuilder numeroTelefoneComDddSemMascara = matcher
                .results()
                .map(MatchResult::group)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);

        if (numeroTelefoneComDddSemMascara.length() < MAX_NUMBER_MOBILE_PHONE) {
            return false;
        }

        String numeroTelefoneSemMascara = numeroTelefoneComDddSemMascara.substring(2);

        // Define o tipo do telefone
        TipoTelefoneBrasileiro tipoTelefoneBrasileiro = getTipoTelefoneBrasileiro(numeroTelefoneSemMascara);

        return tipoTelefoneBrasileiro == TipoTelefoneBrasileiro.MOBILE_PHONE;
    }

    private TipoTelefoneBrasileiro getTipoTelefoneBrasileiro(String numeroTelefoneSemMascara) {
        switch (numeroTelefoneSemMascara.charAt(0)) {
            case '9':
                return TipoTelefoneBrasileiro.MOBILE_PHONE;
            case '2':
            case '3':
            case '4':
            case '5':
                return TipoTelefoneBrasileiro.LANDLINE;
            default:
                return  TipoTelefoneBrasileiro.UNDEFINED;
        }
    }
}

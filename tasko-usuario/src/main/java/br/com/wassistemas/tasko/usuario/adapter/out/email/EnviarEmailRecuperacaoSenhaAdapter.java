package br.com.wassistemas.tasko.usuario.adapter.out.email;

import br.com.wassistemas.tasko.usuario.application.port.out.usuario.EnviarEmailRecuperacaoSenhaPort;
import br.com.wassistemas.tasko.usuario.domain.login.UsuarioResetToken;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.resource.Emailv31;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class EnviarEmailRecuperacaoSenhaAdapter implements EnviarEmailRecuperacaoSenhaPort {

  private final MailjetClient mailjetClient;

  @Override
  public void enviarEmailRecuperacaoSenha(UsuarioResetToken token) throws MailjetException {
    String resetLink = "https://www.wassistemas.com/reset-password?token=" + token.getToken();
    String htmlBody = "<p>Olá,</p>" +
        "<p>Recebemos uma solicitação para redefinir sua senha de acesso ao sistema Tasko.<br>" +
        "Para criar uma nova senha, clique no link abaixo:</p>" +
        "<p><a href=\"" + resetLink + "\">Redefinir minha senha</a></p>" +
        "<p>Se você não solicitou a alteração de senha, por favor ignore este e-mail.<br>" +
        "Por motivos de segurança, este link é válido apenas por tempo limitado.</p>" +
        "<p>Atenciosamente,<br>Equipe Tasko</p>";

    MailjetRequest request = new MailjetRequest(Emailv31.resource)
        .property(Emailv31.MESSAGES, new JSONArray()
            .put(new JSONObject()
                .put(Emailv31.Message.FROM, new JSONObject()
                    .put("Email", "wellingtonasilva@gmail.com")
                    .put("Name", "Tasko Go Suporte"))
                .put(Emailv31.Message.TO, new JSONArray()
                    .put(new JSONObject()
                        .put("Email", token.getEmail())
                        .put("Name", "Usuário Tasko Go")))
                .put(Emailv31.Message.SUBJECT, "Recuperação de senha - Tasko")
                .put(Emailv31.Message.HTMLPART, htmlBody)));
    MailjetResponse response = mailjetClient.post(request);
    log.info("Email de recuperação de senha enviado para o usuário: {} com status {}",
        token.getEmail(), response.getStatus());
  }
}

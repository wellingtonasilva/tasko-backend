package br.com.wassistemas.tasko.common.security;

import br.com.wassistemas.tasko.common.exception.UserUnauthorizedException;
import jakarta.servlet.http.HttpServletRequest;
import java.util.List;

public class JwtUtil {

  /**
   * Extrai o token JWT do header Authorization.
   * @param request HttpServletRequest
   * @return token JWT
   * @throws UserUnauthorizedException se o header estiver ausente ou inválido
   */
  public static String getBearerToken(HttpServletRequest request) throws UserUnauthorizedException {
    String bearerToken = request.getHeader("Authorization");
    if (bearerToken == null || !bearerToken.startsWith("Bearer ")) {
      throw new UserUnauthorizedException("Token de autenticação ausente ou inválido");
    }
    return bearerToken.substring(7);
  }

  /**
   * Obtém a lista de IDs de empresas do claim 'empresas' do JWT.
   * @param request HttpServletRequest
   * @param jwtTokenProvider JwtTokenProvider
   * @return lista de IDs de empresas
   * @throws UserUnauthorizedException se o claim estiver ausente ou inválido
   */
  public static List<Integer> getEmpresas(HttpServletRequest request, JwtTokenProvider jwtTokenProvider)
      throws UserUnauthorizedException {
    String jwt = getBearerToken(request);
    Object empresasClaim = jwtTokenProvider.getClaimFromToken(jwt, "empresas");
    if (empresasClaim == null) {
      throw new UserUnauthorizedException("Claim 'empresas' ausente no JWT.");
    }
    if (empresasClaim instanceof List<?> lista) {
      try {
        List<Integer> empresas = new java.util.ArrayList<>();
        for (Object e : lista) {
          if (e instanceof Integer i) empresas.add(i);
          else if (e instanceof Number n) empresas.add(n.intValue());
          else throw new UserUnauthorizedException("Formato do claim 'empresas' inválido no JWT.");
        }
        return empresas;
      } catch (UserUnauthorizedException ex) {
        throw ex;
      } catch (Exception ex) {
        throw new UserUnauthorizedException("Formato do claim 'empresas' inválido no JWT.");
      }
    }
    throw new UserUnauthorizedException("Formato do claim 'empresas' inválido no JWT.");
  }

  /**
   * Verifica se o usuário tem permissão para acessar a empresa informada.
   * @param request HttpServletRequest
   * @param jwtTokenProvider JwtTokenProvider
   * @param empresaId ID da empresa
   * @return true se tiver permissão
   * @throws UserUnauthorizedException se não tiver permissão
   */
  public static void validarPermissaoEmpresa(HttpServletRequest request,
      JwtTokenProvider jwtTokenProvider, Integer empresaId)
      throws UserUnauthorizedException {
    List<Integer> empresas = getEmpresas(request, jwtTokenProvider);
    if (!empresas.contains(empresaId)) {
      throw new UserUnauthorizedException("Usuário não tem permissão para acessar esta empresa.");
    }
  }
}

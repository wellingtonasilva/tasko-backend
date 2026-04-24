package br.com.wassistemas.tasko.common.enumerations;

import lombok.Getter;

@Getter
public enum PerfilTipo {
  ROLE_GUEST,
  ROLE_ADMIN,
  ROLE_STAFF,
  ROLE_USER;

  public static PerfilTipo from(int id) {
    PerfilTipo[] values = PerfilTipo.values();
    if (id >= 0 && id < values.length) {
      return values[id];
    }
    return null;
  }

  public static PerfilTipo from(String name) {
    try {
      return PerfilTipo.valueOf(name);
    } catch (IllegalArgumentException | NullPointerException e) {
      return null;
    }
  }
}

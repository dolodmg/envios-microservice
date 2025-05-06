package com.todocode.envios.model;

import jakarta.persistence.Enumerated;

public enum Estado {
    PENDIENTE,
    EN_PREPARACION,
    EN_CAMINO,
    ENTREGADO,
    DEVUELTO,
    CANCELADO,
    NO_ENTREGADO
}

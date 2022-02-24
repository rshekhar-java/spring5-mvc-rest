package com.rs.springframework.controllers.v1;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * created by rs 2/24/2022.
 */
public abstract class AbstractRestControllerTest {
    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

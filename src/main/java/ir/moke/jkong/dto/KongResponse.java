package ir.moke.jkong.dto;

import java.util.List;

public record KongResponse<T>(String offset,
                              List<T> data,
                              String next) {
}

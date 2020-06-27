package com.qianfeng;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class User implements Serializable {
    private String id;
    private String username;
    private String password;
}

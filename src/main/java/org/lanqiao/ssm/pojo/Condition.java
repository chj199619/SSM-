package org.lanqiao.ssm.pojo;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Condition {
    private Integer currentPage;
    private Integer pageSize;
}

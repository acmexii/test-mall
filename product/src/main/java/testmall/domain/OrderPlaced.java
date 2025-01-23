package testmall.domain;

import java.util.*;
import lombok.*;
import testmall.domain.*;
import testmall.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String userid;
    private String productname;
    private Long productid;
    private Integer qty;
}

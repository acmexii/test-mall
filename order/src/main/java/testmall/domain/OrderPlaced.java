package testmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import testmall.domain.*;
import testmall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String userid;
    private String productname;
    private Long productid;
    private Integer qty;

    public OrderPlaced(Order aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}
//>>> DDD / Domain Event

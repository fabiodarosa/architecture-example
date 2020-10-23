package com.example.architecture.contract.v1.order;

import com.example.architecture.contract.v1.order.mapper.OrderMapper;
import com.example.architecture.contract.v1.order.model.request.CreateOrderRequest;
import com.example.architecture.contract.v1.order.model.response.OrderResponse;
import com.example.architecture.impl.ImplFacade;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class OrderContractFacade {

    private ImplFacade implFacade;

    OrderResponse findById(String id) {
        return OrderMapper.mapToContract(implFacade.user().findById(id));
    }

    OrderResponse create(CreateOrderRequest user) {
        implFacade.order().find();
        return OrderMapper.mapToContract(implFacade.user().create(OrderMapper.mapToImpl(user)));
    }

}

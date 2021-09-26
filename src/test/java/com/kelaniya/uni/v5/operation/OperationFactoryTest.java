package com.kelaniya.uni.v5.operation;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class OperationFactoryTest {

    @Test
    public void should_return_AddOperation_object_when_operator_is_Add(){
        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("Add");

        assertThat(operation, instanceOf(AddOperation.class));
    }

    @Test
    public void should_return_SubOperation_object_when_operator_is_Sub(){
        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("Sub");

        assertThat(operation, instanceOf(SubOperation.class));
    }

    @Test
    public void should_return_MulOperation_object_when_operator_is_Muld(){
        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("Mul");

        assertThat(operation, instanceOf(MulOperation.class));
    }

    @Test
    public void should_return_DivOperation_object_when_operator_is_Div(){
        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("Div");

        assertThat(operation, instanceOf(DivOperation.class));
    }

}
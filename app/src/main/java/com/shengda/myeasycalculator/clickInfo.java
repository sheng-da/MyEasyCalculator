package com.shengda.myeasycalculator;

import java.math.BigDecimal;

/**
 * Created by shengda on 5/30/17.
 */


/**
 * This class define clickInfo, where we stored the former display screen value or operators.
 * The value field is used to store the value, and the type field define whether the clickinfo
 * is a number or an operator.
 */
public class clickInfo {


    BigDecimal value; // store the value
    int type = 0; // store the type

    /**
     * Constuctor for the clickInfo.
     * @param value The former display screen value.
     * @param type The type of the value. Usually DataType.NUM in this situation.
     */
    public clickInfo(BigDecimal value, int type) {
        this.value = value;
        this.type = type;
    }

    /**
     * Constuctor for the clickInfo.
     * Set the value to null because we only need to store the operator.
     * @param type The type: Usually DataType.ADD, DataType.MINUS, DataType.MULTIPLY or
     *             DataType.DIVIDE in this situation.
     */
    public clickInfo(int type) {
        this.value = null;
        this.type = type;
    }


}


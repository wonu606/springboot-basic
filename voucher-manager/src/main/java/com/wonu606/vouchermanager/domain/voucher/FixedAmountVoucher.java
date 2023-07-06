package com.wonu606.vouchermanager.domain.voucher;

import com.wonu606.vouchermanager.domain.voucher.discountvalue.FixedAmountValue;
import com.wonu606.vouchermanager.domain.voucher.price.Price;
import java.util.UUID;

public class FixedAmountVoucher extends Voucher {

    public FixedAmountVoucher(UUID uuid, FixedAmountValue fixedAmountValue) {
        super(uuid, fixedAmountValue);
    }

    @Override
    public double calculateDiscountedPrice(Price originalPrice) {
        return Math.max(originalPrice.getValue() - discountValue.getValue(), 0);
    }


}

package com.wonu606.vouchermanager.domain.voucher;

import com.wonu606.vouchermanager.domain.voucher.discountvalue.PercentageDiscountValue;
import com.wonu606.vouchermanager.domain.voucher.price.Price;
import java.util.UUID;

public class PercentageVoucher extends Voucher {

    public PercentageVoucher(UUID uuid, PercentageDiscountValue percentageDiscountValue) {
        super(uuid, percentageDiscountValue);
    }

    @Override
    public Price calculateDiscountedPrice(Price originalPrice) {
        return new Price(originalPrice.getValue() * (1 - discountValue.getValue() / 100));
    }
}

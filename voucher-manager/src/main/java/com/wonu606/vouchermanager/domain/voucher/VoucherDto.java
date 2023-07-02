package com.wonu606.vouchermanager.domain.voucher;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class VoucherDto {

    private final String type;
    private final UUID uuid;
    private final double discountValue;
}
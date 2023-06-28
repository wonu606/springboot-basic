package com.wonu606.Controller.command;

import com.wonu606.vouchermanager.domain.VoucherVO;
import com.wonu606.vouchermanager.io.ConsoleInputView;
import com.wonu606.vouchermanager.io.ConsolePrinterView;
import com.wonu606.vouchermanager.service.VoucherService;

public class VoucherCreateCommand implements VoucherCommand {

    private final ConsoleInputView inputView;
    private final ConsolePrinterView printerView;
    private final VoucherService voucherService;

    public VoucherCreateCommand(ConsoleInputView inputView, ConsolePrinterView printerView,
            VoucherService voucherService) {
        this.inputView = inputView;
        this.printerView = printerView;
        this.voucherService = voucherService;
    }

    @Override
    public CommandResult execute() {
        printerView.printCreatableList();
        VoucherVO voucherVO = generateVoucherVO();
        voucherService.createVoucher(voucherVO);
        return new CommandResult();
    }

    private VoucherVO generateVoucherVO() {
        String type = inputView.inputString("타입: ");
        double value = inputView.inputDouble("값: ");
        return new VoucherVO(type, value);
    }
}
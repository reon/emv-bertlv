package com.willcurrie.decoders;

import com.willcurrie.DecodedData;

public class ReadRecordAPDUDecoder implements CommandAPDUDecoder {
    @Override
    public APDUCommand getCommand() {
        return APDUCommand.ReadRecord;
    }

    @Override
    public DecodedData decode(String input, int startIndexInBytes) {
        return new DecodedData("C-APDU: Read Record ", input.substring(4, 8), startIndexInBytes, startIndexInBytes + 5);
    }
}

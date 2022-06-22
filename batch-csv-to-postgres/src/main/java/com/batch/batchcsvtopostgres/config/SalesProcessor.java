package com.batch.batchcsvtopostgres.config;

import com.batch.batchcsvtopostgres.model.SalesRecord;
import org.springframework.batch.item.ItemProcessor;

public class SalesProcessor implements ItemProcessor<SalesRecord, SalesRecord> {
    @Override
    public SalesRecord process(SalesRecord salesRecord) throws Exception {
        return salesRecord;
    }
}

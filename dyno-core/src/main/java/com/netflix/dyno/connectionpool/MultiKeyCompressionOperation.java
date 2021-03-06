package com.netflix.dyno.connectionpool;
/**
 * 
 * Interface to be used for multi key operations, i.e. 
 * taking as input an vararg like String...
 *
 * 
 * @author ipapapa
 *
 * @param <CL>
 * @param <R>
 */
public interface MultiKeyCompressionOperation<CL, R> extends Operation<CL, R> {

	 String[] compressMultiKeyValue(ConnectionContext ctx, String... value);

    String decompressValue(ConnectionContext ctx, String value);
}
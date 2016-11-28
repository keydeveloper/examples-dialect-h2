package com.keydeveloper.plugins.h2;

import com.keydeveloper.api.plugins.Dialect;
import com.keydeveloper.domain.dialect.DialectConfig;

/**
 * H2 dialect. This is a minimal, but working, example. See config/dialect.h2.config
 * for an example on how to define dialect data types.
 * <p>
 * This example can be extended by overriding Dialect methods.
 */
public class H2Dialect extends Dialect
{
	public H2Dialect(DialectConfig config)
	{
		super(config);
	}
}

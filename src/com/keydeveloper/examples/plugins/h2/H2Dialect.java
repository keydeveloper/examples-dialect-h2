package com.keydeveloper.examples.plugins.h2;

import com.keydeveloper.api.plugins.Dialect;
import com.keydeveloper.domain.dialect.DialectConfig;

/**
 * This is a minimal database dialect example, targeting the H2 database.
 * <p>>
 * The data types for H2 are defined in config/dialect.h2.config.
 * <p>
 * See the GitHub README file for information about building and installing the plugin.
 * <p>
 * This example can be extended by overriding the Dialect methods.
 */
public class H2Dialect extends Dialect
{
	public H2Dialect(DialectConfig config)
	{
		super(config);
	}
}

package org.minazou67.sample.ee6.cdi;

import java.util.logging.Logger;

import javax.enterprise.context.RequestScoped;

import org.minazou67.sample.ee6.interceptors.Logable;

@Logable
@RequestScoped
public class SampleServiceImpl implements SampleService {

	private static final Logger LOG = Logger.getLogger(SampleServiceImpl.class.getName());

	@Override
	public int find(long id) {
		LOG.info("Find! [" + id + "]");
		return 0;
	}
}

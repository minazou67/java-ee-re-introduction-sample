package org.minazou67.sample.ee6.interceptors;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@Logable
public class LoggingInterceptor implements Serializable {

	@AroundInvoke
	public Object invoke(InvocationContext ic) throws Exception {
		Logger logger = Logger.getLogger(ic.getTarget().getClass().getSuperclass().getName());
		logger.info(ic.getMethod().getName() + " start.");
		try {
			return ic.proceed();
		} finally {
			logger.info(ic.getMethod().getName() + " end.");
		}
	}
}

package org.emerjoin.mpesa.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 * @author Mario Junior.
 */
@ApplicationScoped
public class MpesaServiceImpl implements MpesaService {

    @Inject
    private Configuration configuration;

    @Override
    public Payment execute(PaymentOrder paymentOrder) throws MpesaException {

        //TODO: Implement
        throw new UnsupportedOperationException();

    }

}

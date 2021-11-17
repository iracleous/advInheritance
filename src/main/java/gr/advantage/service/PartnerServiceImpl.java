package gr.advantage.service;

import gr.advantage.model.Partner;

public class PartnerServiceImpl implements PersonFunctions{

    private final Partner partner;

    public PartnerServiceImpl(Partner partner) {
        this.partner = partner;
    }

    @Override
    public void register() {
        partner.setActive(true);
    }

    @Override
    public String getStatus() {
        if (partner.isActive()){
            return HIRED;
        }
        return NOT_HIRED;

        // return partner.isActive()?HIRED:NOT_HIRED;
    }
}

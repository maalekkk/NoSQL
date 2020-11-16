package com.campaign.banksMarketingCampaign.model.enums;

public enum Month {

        jan("jan"),
        feb("feb"),
        mar("mar"),
        apr("apr"),
        may("may"),
        jun("jun"),
        jul("jul"),
        aug("aug"),
        sep("sep"),
        oct("oct"),
        nov("nov"),
        dec("dec");

        private String month;

        Month(String month) {
            this.month = month;
        }

        @Override
        public String toString() {
            return month;
        }
}

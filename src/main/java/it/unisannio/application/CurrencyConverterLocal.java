package it.unisannio.application;

import javax.ejb.Local;

@Local
public interface CurrencyConverterLocal {
   float convert(float euro);
}

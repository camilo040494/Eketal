/**
 * generated by Xtext 2.10.0
 */
package co.edu.icesi.eketal;

import co.edu.icesi.eketal.EketalStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class EketalStandaloneSetup extends EketalStandaloneSetupGenerated {
  public static void doSetup() {
    new EketalStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}

package org.jboss.as.console.testsuite.pages.runtime;

import org.jboss.arquillian.graphene.page.Location;
import org.jboss.as.console.testsuite.pages.BasePage;

/**
 * @author jcechace
 *
 * This class represents a meta page entry point to the Runtime part of the consle in standalone.
 * As such it is meant for navigation purposes only and thus can't be instantiated. Also note
 * that the actual landing page is determined by console and may change in the future.
 *
 */
@Location("#standalone-runtime")
abstract public class StandaloneRuntimeEntryPoint extends BasePage {
}

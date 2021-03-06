package org.jboss.as.console.testsuite.pages.admin;

import org.jboss.arquillian.graphene.page.Location;
import org.jboss.as.console.testsuite.pages.BasePage;

/**
 * @author jcechace
 *
 * This class represents a meta page entry point to the Administration part of the consle.
 * As such it is meant for navigation purposes only and thus can't be instantiated. Also note
 * that the actual landing page is determined by console and may change in the future.
 *
 */
@Location("#administration")
abstract public class AdminEntryPoint extends BasePage {
}

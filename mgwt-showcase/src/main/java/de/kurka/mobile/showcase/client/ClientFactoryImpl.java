/**
 * 28.12.2010
 * created by kurt
 */
package de.kurka.mobile.showcase.client;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;

import de.kurka.mobile.showcase.client.activities.AboutView;
import de.kurka.mobile.showcase.client.activities.AboutViewImpl;
import de.kurka.mobile.showcase.client.activities.AnimationDoneView;
import de.kurka.mobile.showcase.client.activities.AnimationDoneViewImpl;
import de.kurka.mobile.showcase.client.activities.AnimationView;
import de.kurka.mobile.showcase.client.activities.AnimationViewImpl;
import de.kurka.mobile.showcase.client.activities.ElementsView;
import de.kurka.mobile.showcase.client.activities.ElementsViewImpl;
import de.kurka.mobile.showcase.client.activities.ButtonBarViewGwtImpl;
import de.kurka.mobile.showcase.client.activities.ButtonBarView;
import de.kurka.mobile.showcase.client.activities.HomeView;
import de.kurka.mobile.showcase.client.activities.HomeViewImpl;
import de.kurka.mobile.showcase.client.activities.ScrollWidgetView;
import de.kurka.mobile.showcase.client.activities.ScrollWidgetViewImpl;
import de.kurka.mobile.showcase.client.activities.UIView;
import de.kurka.mobile.showcase.client.activities.UIViewImpl;

/**
 * @author kurt
 *
 */
public class ClientFactoryImpl implements ClientFactory {

	private EventBus eventBus;
	private PlaceController placeController;
	private HomeView homeViewImpl;
	private UIView uiView;
	private AboutView aboutView;
	private AnimationView animationView;
	private AnimationDoneView animationDoneView;
	private ScrollWidgetView scrollWidgetView;
	private ElementsView elementsView;
	private ButtonBarViewGwtImpl footerPanelView;

	public ClientFactoryImpl() {
		eventBus = new SimpleEventBus();

		placeController = new PlaceController(eventBus);

		homeViewImpl = new HomeViewImpl();
	}

	@Override
	public HomeView getHomeView() {
		if (homeViewImpl == null) {
			homeViewImpl = new HomeViewImpl();
		}
		return homeViewImpl;
	}

	@Override
	public EventBus getEventBus() {
		return eventBus;
	}

	@Override
	public PlaceController getPlaceController() {
		return placeController;
	}

	@Override
	public UIView getUIView() {
		if (uiView == null) {
			uiView = new UIViewImpl();
		}
		return uiView;
	}

	/* (non-Javadoc)
	 * @see de.kurka.mobile.showcase.client.ClientFactory#getAboutView()
	 */
	@Override
	public AboutView getAboutView() {
		if (aboutView == null) {
			aboutView = new AboutViewImpl();
		}

		return aboutView;
	}

	/* (non-Javadoc)
	 * @see de.kurka.mobile.showcase.client.ClientFactory#getAnimationView()
	 */
	@Override
	public AnimationView getAnimationView() {
		if (animationView == null) {
			animationView = new AnimationViewImpl();
		}
		return animationView;
	}

	/* (non-Javadoc)
	 * @see de.kurka.mobile.showcase.client.ClientFactory#getAnimationDoneView()
	 */
	@Override
	public AnimationDoneView getAnimationDoneView() {
		if (animationDoneView == null) {
			animationDoneView = new AnimationDoneViewImpl();
		}
		return animationDoneView;
	}

	/* (non-Javadoc)
	 * @see de.kurka.mobile.showcase.client.ClientFactory#getScrollWidgetView()
	 */
	@Override
	public ScrollWidgetView getScrollWidgetView() {
		if (scrollWidgetView == null) {
			scrollWidgetView = new ScrollWidgetViewImpl();
		}
		return scrollWidgetView;
	}

	/* (non-Javadoc)
	 * @see de.kurka.mobile.showcase.client.ClientFactory#getElementsView()
	 */
	@Override
	public ElementsView getElementsView() {
		if (elementsView == null) {
			elementsView = new ElementsViewImpl();
		}
		return elementsView;
	}

	/* (non-Javadoc)
	 * @see de.kurka.mobile.showcase.client.ClientFactory#getFooterPanelView()
	 */
	@Override
	public ButtonBarView getButtonBarView() {
		if (footerPanelView == null) {
			footerPanelView = new ButtonBarViewGwtImpl();
		}
		return footerPanelView;
	}

}
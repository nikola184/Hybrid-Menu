package kaesdingeling.hybridmenu.demo.page;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class GroupPage extends VerticalLayout implements View {
	private static final long serialVersionUID = 1L;
	
	public GroupPage() {
		Label title = new Label();
		title.setCaption("Group");
		title.setValue("Group view");
		addComponent(title);
	}

	@Override
	public void enter(ViewChangeEvent event) {
	}
}
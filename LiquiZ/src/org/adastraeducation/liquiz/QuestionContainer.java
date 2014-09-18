package org.adastraeducation.liquiz;
import java.util.ArrayList;

public class QuestionContainer implements Displayable {
	private ArrayList<Displayable> displayables;

	public QuestionContainer() {
		displayables = new ArrayList<Displayable>();
	}

	public ArrayList<Displayable> getDisplayables() {
		return this.displayables;
	}

	public void add(Question q){
		displayables.add(q);
	}

	public void delete(Question q){
		displayables.remove(q);
	}

	public void writeHTML (StringBuilder b) {
		for(Displayable d : displayables)
		{
			d.writeHTML(b);
		}
	}

	public void writeXML (StringBuilder b) {
		for (Displayable d : displayables)
		{
			d.writeXML(b);
		}
	}

	public void writeJS (StringBuilder b) {
		b.append("{title:... [");
		for(Displayable d : displayables)
		{
			d.writeJS(b);
		}
		b.append("] };");
	}
}

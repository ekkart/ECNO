package coded.gui;

import java.util.ArrayList;
import java.util.List;

import workflow.Case;

public class IteratorInfo {
	
	public List<InteractionItem> items;
	public Case case_;
	
	public IteratorInfo(Case case_) {

		items = new ArrayList<InteractionItem>();
		this.case_ = case_;
		
	}
	

}

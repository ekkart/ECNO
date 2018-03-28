package dk.dtu.imm.se.ecno.eclipse.save.behaviour;

import dk.dtu.imm.se.ecno.core.IElementBehaviour;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourState;

public interface ISavableElementBehaviour extends IElementBehaviour {
	
	/**
	 * This method initializes the ISavableElementBehaviour from a saved
	 * BehaviourState. This methods should be called at most once in the 
	 * life-time of the ISavableElementBehaviour, right after its creation
	 * before the behaviour is ever executed. If this method is not
	 * called, the IElementBahaviour starts from its default behaviour.
	 * 
	 * @param state the state for this behaviour
	 */
	public void initializeFromBehaviourState(BehaviourState state);
	
	/**
	 * Returns the current state of the ISavableElementBehaviour. Note that
	 * the ISavableElementBehaviour can return the same BehaviourState object
	 * every time it is called or can create a new one every time this method
	 * is called -- of course the BehaviourState object needs to be updated 
	 * to reflect the current state.
	 * 
	 * @return a BehaviourState that reflects the current state of the behaviour
	 */
	public BehaviourState getBehaviourState();

}

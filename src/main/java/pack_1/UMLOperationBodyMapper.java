package pack_1;

import java.util.List;

public class UMLOperationBodyMapper {

	private List<StatementObject> nonMappedLeavesT1;
	private List<StatementObject> nonMappedLeavesT2;
	private List<CompositeStatementObject> nonMappedInnerNodesT1;
	private List<CompositeStatementObject> nonMappedInnerNodesT2;

	public List<StatementObject> getNonMappedLeavesT1() {
		return nonMappedLeavesT1;
	}

	public List<StatementObject> getNonMappedLeavesT2() {
		return nonMappedLeavesT2;
	}

	public List<CompositeStatementObject> getNonMappedInnerNodesT1() {
		return nonMappedInnerNodesT1;
	}

	public List<CompositeStatementObject> getNonMappedInnerNodesT2() {
		return nonMappedInnerNodesT2;
	}
}

package pack_1;

import java.util.ArrayList;
import java.util.List;

public class InlineOperationRefactoring {

	private UMLOperationBodyMapper bodyMapper;

	public InlineOperationRefactoring(UMLOperationBodyMapper bodyMapper) {
		this.bodyMapper = bodyMapper;
	}

	public List leftSide() {
		List<AbstractStatement> ranges = new ArrayList<AbstractStatement>();
		for (AbstractStatement abstractStatement : ranges) {
			System.out.println(abstractStatement);
		}
		for (StatementObject statement : bodyMapper.getNonMappedLeavesT1()) {
			ranges.add(statement.codeRange());
		}
		for (CompositeStatementObject statement : bodyMapper.getNonMappedInnerNodesT1_RENAMED()) {
			ranges.add(statement.codeRange());
		}
		return ranges;
	}
}

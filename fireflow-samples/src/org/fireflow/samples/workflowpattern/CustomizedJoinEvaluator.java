package org.fireflow.samples.workflowpattern;

import java.util.List;

import org.fireflow.client.WorkflowQuery;
import org.fireflow.client.WorkflowSession;
import org.fireflow.client.impl.WorkflowSessionLocalImpl;
import org.fireflow.engine.context.RuntimeContext;
import org.fireflow.engine.modules.persistence.PersistenceService;
import org.fireflow.engine.modules.persistence.TokenPersister;
import org.fireflow.pdl.fpdl20.behavior.router.AbsJoinEvaluator;
import org.fireflow.pdl.fpdl20.process.Synchronizer;
import org.fireflow.pvm.kernel.Token;
import org.fireflow.pvm.kernel.TokenState;

public class CustomizedJoinEvaluator extends AbsJoinEvaluator {

	
	
	@Override
	public int canBeFired(WorkflowSession session,
			Token current_token_for_router, List<Token> siblingTokens,
			Synchronizer node) {
		String fromTokenId = current_token_for_router.getFromToken();
		
		WorkflowQuery<Token> q4Token = session.createWorkflowQuery(Token.class);
		
		Token fromToken = q4Token.get(fromTokenId);
		
		if (fromToken!=null && "CustomizedRouter.main.Transition6".equals(fromToken.getElementId())){
			//ִ��֮ǰ�������е��ֵ�token��state����Ϊcompleted״̬����һ������ִ�У���������ʵ��������ȷcomplete
			if (siblingTokens!=null){
				for (Token sibling: siblingTokens){
					if (!sibling.getId().equals(current_token_for_router.getId())){
						sibling.setState(TokenState.COMPLETED);
					}
				}
			}
			
			return current_token_for_router.getStepNumber();
		}
		else{
			//����״����ͳͳ���ܱ�ִ��
			current_token_for_router.setState(TokenState.COMPLETED);//ֱ������Ϊcompleted״̬

			return -1;//-1��ʾ���ܱ�ִ��

		}
		
	}

	public String getJoinDescription() {
		String desc = "ֻ��Transition6�ϵ�Token���ܼ�����Router�������Ķ�������";
		return desc;
	}

}

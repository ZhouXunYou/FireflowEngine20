package org.fireflow.samples.workflowpattern;

import java.util.Map;

import org.fireflow.client.WorkflowSession;
import org.fireflow.engine.context.RuntimeContext;
import org.fireflow.pdl.fpdl20.behavior.router.AbsSplitEvaluator;
import org.fireflow.pdl.fpdl20.behavior.router.SplitEvaluator;
import org.fireflow.pdl.fpdl20.process.Transition;

public class CustomizedSplitEvaluator extends AbsSplitEvaluator implements SplitEvaluator {

	protected boolean canBeFired(Transition transition,WorkflowSession session,
			RuntimeContext rtCtx,Map<String, Object> scriptEngineVariableContext){
		if (transition.getName().equals("Transition2")){
			return true;
		}else{
			return super.canBeFired(transition, session, rtCtx, scriptEngineVariableContext);
		}
	}

	
	/**
	 * �˴�������֧�߼�����������ͼ�Ķ����
	 */
	public String getSplitDescription() {
		String desc = "����֧�߼�����transition2�ϵ������жϣ�����ִ��Transition3�ϵ������ж�";
		return desc;
	}

}

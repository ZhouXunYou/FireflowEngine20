package org.fireflow.samples.event;

import org.fireflow.engine.entity.runtime.WorkItem;
import org.fireflow.engine.modules.workitem.event.AbsWorkItemEventListener;
import org.fireflow.engine.modules.workitem.event.WorkItemEvent;
import org.fireflow.pdl.fpdl20.process.Activity;

public class MyWorkItemEventListener extends AbsWorkItemEventListener {

	@Override
	protected void afterWorkItemEnd(WorkItemEvent e) {
		WorkItem workItem = e.getSource();
		Activity activity = (Activity)e.getWorkflowElement();
		System.out.println("~~�����¼�MyWorkItemEventListener.afterWorkItemEnd(...)");
		System.out.println("~~~~�����¼��Ĺ������ǣ�id="+workItem.getId()+";����="+
				workItem.getSubject()+"; state="+workItem.getState().getDisplayName());
		
		System.out.println("~~~~�ù������Ӧ�Ļ�ڵ��ǣ�id="+activity.getId());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		super.afterWorkItemEnd(e);
	}

	@Override
	protected void onWorkItemCreated(WorkItemEvent e) {
		WorkItem workItem = e.getSource();
		Activity activity = (Activity)e.getWorkflowElement();
		System.out.println("~~�����¼�MyWorkItemEventListener.onWorkItemCreated(...)");
		System.out.println("~~~~�����¼��Ĺ������ǣ�id="+workItem.getId()+";����="+
				workItem.getSubject()+"; state="+workItem.getState().getDisplayName());
		
		System.out.println("~~~~�ù������Ӧ�Ļ�ڵ��ǣ�id="+activity.getId());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		super.afterWorkItemEnd(e);
	}

	@Override
	protected void afterWorkItemClaimed(WorkItemEvent e) {
		WorkItem workItem = e.getSource();
		Activity activity = (Activity)e.getWorkflowElement();
		System.out.println("~~�����¼�MyWorkItemEventListener.afterWorkItemClaimed(...)");
		System.out.println("~~~~�����¼��Ĺ������ǣ�id="+workItem.getId()+";����="+
				workItem.getSubject()+"; state="+workItem.getState().getDisplayName());
		
		System.out.println("~~~~�ù������Ӧ�Ļ�ڵ��ǣ�id="+activity.getId());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		super.afterWorkItemClaimed(e);
	}

	@Override
	protected void beforeWorkItemClaimed(WorkItemEvent e) {
		WorkItem workItem = e.getSource();
		Activity activity = (Activity)e.getWorkflowElement();
		System.out.println("~~�����¼�MyWorkItemEventListener.beforeWorkItemClaimed(...)");
		System.out.println("~~~~�����¼��Ĺ������ǣ�id="+workItem.getId()+";����="+
				workItem.getSubject()+"; state="+workItem.getState().getDisplayName());
		
		System.out.println("~~~~�ù������Ӧ�Ļ�ڵ��ǣ�id="+activity.getId());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		super.beforeWorkItemClaimed(e);
	}

	
}

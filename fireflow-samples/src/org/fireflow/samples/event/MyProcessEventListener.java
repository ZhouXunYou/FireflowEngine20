package org.fireflow.samples.event;

import java.util.ArrayList;
import java.util.List;

import org.fireflow.engine.entity.runtime.ProcessInstance;
import org.fireflow.engine.exception.InvalidOperationException;
import org.fireflow.engine.modules.instancemanager.event.AbsProcessInstanceEventListener;
import org.fireflow.engine.modules.instancemanager.event.ProcessInstanceEvent;
import org.fireflow.pdl.fpdl20.process.SubProcess;
import org.fireflow.samples.pojo.Company;
import org.fireflow.samples.pojo.Employee;

public class MyProcessEventListener extends AbsProcessInstanceEventListener {

	@Override
	protected void afterProcessInstanceEnd(ProcessInstanceEvent e) {
		ProcessInstance procInst = e.getSource();
		SubProcess subProcess = (SubProcess)e.getWorkflowElement();
		
		System.out.println("==�����¼�MyProcessEventListener.afterProcessInstanceEnd(...)");
		System.out.println("====�����¼�������ʵ���ǣ�id="+procInst.getId()+";displayName="+
				procInst.getProcessDisplayName()+"; state="+procInst.getState().getDisplayName());
		System.out.println("====��ʵ����Ӧ�����̶����ǣ�id="+subProcess.getId());
		System.out.println("===============================================");

		super.afterProcessInstanceEnd(e);
	}

	/**
	 * ProcessInstance����֮��Run֮ǰ�ᴥ�����¼�
	 */
	@Override
	protected void onProcessInstanceCreated(ProcessInstanceEvent e) {
		ProcessInstance procInst = e.getSource();
		SubProcess subProcess = (SubProcess)e.getWorkflowElement();
		System.out.println("==�����¼�MyProcessEventListener.onProcessInstanceCreated(...)");
		System.out.println("====�����¼�������ʵ���ǣ�id="+procInst.getId()+";displayName="+
				procInst.getProcessDisplayName()+"; state="+procInst.getState().getDisplayName());
		System.out.println("====��ʵ����Ӧ�����̶����ǣ�id="+subProcess.getId());
		System.out.println("====ͨ�����¼���������һЩ���ӵĳ�ʼ�������������ʼ��һ���������͵����̱�������ͨ��ģ�����ݲ鿴���������̱���������");
		System.out.println("===============================================");
		
		//��ʼ��һ�����ӵ����̱���
		Company company = new Company();
		company.setId("company123");
		company.setName("FireSOA��Դ��֯");
		company.setAddress("����");
		
		List<Employee> allEmployees = new ArrayList<Employee>();
		
		Employee employee1 = new Employee();
		employee1.setId("1");
		employee1.setName("��Ҳ");
		employee1.setAge(99);
		employee1.setSalary(999999.9f);
		employee1.setDeptId("dept1");
		
		allEmployees.add(employee1);
		
		Employee employee2 = new Employee();
		employee2.setId("2");
		employee2.setName("̫��");
		employee2.setAge(99);
		employee2.setSalary(999999.9f);
		employee2.setDeptId("dept2");
		
		allEmployees.add(employee2);
		
		Employee employee3 = new Employee();
		employee3.setId("3");
		employee3.setName("�޼�");
		employee3.setAge(999);
		employee3.setSalary(100000f);
		employee3.setDeptId("dept3");
		
		allEmployees.add(employee3);
		
		company.setAllEmployees(allEmployees);
		
		//����Listener���׳����쳣�����������Զ�����ȫ�����Ե���������Listener�еĴ���Ӱ������ִ�С�
		//���ԣ���õķ�������Listener�����д����쳣��Ϣ��
		try {
			procInst.setVariableValue(e.getCurrentWorkflowSession(), "company", company);
		} catch (InvalidOperationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		super.onProcessInstanceCreated(e);
	}

}

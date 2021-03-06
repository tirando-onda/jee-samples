package tirando.onda.jee.activiti.exemplo1;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.runtime.ProcessInstance;

public class ActivitiSample {
	
	public static void main(String[] args) {
		ProcessEngine engine = ProcessEngineConfiguration.createStandaloneProcessEngineConfiguration()
		  .setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE)
		  .setJdbcDriver("org.h2.Driver")
		  .setJdbcUrl("jdbc:h2:tcp://localhost/~/Java/activiti-5.5/apps/h2/activiti")
		  .setJdbcUsername("sa")
		  .setJdbcPassword("")
		  .setJobExecutorActivate(false)
		  .buildProcessEngine();

//		RepositoryService repositoryService = engine.getRepositoryService();
//		repositoryService.createDeployment()
//			.name("repo1")
//			.addClasspathResource("sample.bpmn20.xml")
//			.deploy();

//		System.out.println(repositoryService.createDeploymentQuery().count());
//
		ProcessInstance inst = engine.getRuntimeService().startProcessInstanceByKey("sid-9c50dc6c-7a05-4fe7-94a7-e733b1dc5de4");
		System.out.println(inst.getBusinessKey());
//		
//		System.out.println(engine.getRuntimeService().createExecutionQuery().count());
		
//		engine.getRuntimeService().signal(executionId)
		

		
	}

}

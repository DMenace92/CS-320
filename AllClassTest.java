import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class AllClassTest {
	String taskId, taskName, taskInfo, contactId, firstName, lastName, phoneNumber, address,
	appointmentId, appointmentInfo, appDate;
	
	@BeforeEach
	void setUp() {
		contactId = "1";
		firstName = "Andrew";
		lastName = "Enwiya";
		phoneNumber = "2349021293";
		address = "123 LeftView dr";
		
		taskId = "1";
		taskName = "Coding";
		taskInfo = "take some time to learn somthing new";
		
		appointmentId = "1";
		appointmentInfo = "Adviser";
		appDate = "10-30-2023";
	}
//	@BeforeEach
//	void setUpTask() {
//		taskId = "1";
//		taskName = "Coding";
//		taskInfo = "take some time to learn somthing new";
//		
//	}
//	@BeforeEach
//	void setUpAppointment() {
//		appointmentId = "1";
//		appointmentInfo = "Adviser";
//		appDate = "10-30-2023";
//	}
	

	//@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	//--------Contact CRUD test---------
	@Test
	void CreateContactTest() {
		ContactService contact = new ContactService();
		contact.CreateContact(contactId, firstName, lastName, phoneNumber, address);
		assertTrue(ContactService.CreateContact("2", "Dennis", "Enwiya", "2223334444", "123 w area ln"));
		assertTrue(ContactService.CreateContact("3", "Donna", "Enwiya", "2225556666", "123 w uptown ln"));
		assertTrue(ContactService.CreateContact("4", "David", "Enwiya", "2227778888", "123 w down ln"));
	}
	
//	void CreateContactErrorTest() {
//		ContactService contact = new ContactService();
//		contact.CreateContact(contactId, firstName, lastName, phoneNumber, address);
//		assertFalse(ContactService.CreateContact("5",null, null, "1123234542", "5532 w park view dr"));
//		assertFalse(ContactService.CreateContact("6", "rocky","Enwiya", "9948302934", "777 w Heaven ave"));
//		
//	}
//	@Test CreateContactErrorLengthTest(){
//		ContactService contact = new ContactService();
//		contact.CreateContact(contact,firstName, lastName, phoneNumber, address);
//		assertNull("12345943039", "Sonia", "Enwiya", "1223322333", "123 w NoWHere town ln");
//	}
//	@Test 
//	void FetchByIdNumberTest(){
//		
//	}
	@Test 
	void FetchContactTest(){
		ContactService contact = new ContactService();
		TaskService Task = new TaskService();
		AppointmentService App = new AppointmentService();
		Task.FetchTask();
		contact.FetchContact();
		App.FetchApp();
		
		
	}
	@Test
	void UpdateContactFirstNameTest(){
		ContactService contact = new ContactService();
		contact.UpdateContactFirstName(contactId, firstName);
		assertTrue(ContactService.UpdateContactFirstName("3", "DonnaM"));
		
	}
	@Test
	void UpdateContactLastNameTest() {
		ContactService contact = new ContactService();
		contact.UpdateContactLastName(contactId, lastName);
		assertTrue(ContactService.UpdateContactLastName("3", "enwiya"));
	}
	
	@Test
	void UpdateContactPhoneNumberTest() {
		ContactService contact = new ContactService();
		contact.UpdateContactPhoneNumber(contactId, phoneNumber);
		assertTrue(ContactService.UpdateContactPhoneNumber("1", "7777777777"));
	}
	@Test
	void UpdateContactAddressTest() {
		ContactService contact = new ContactService();
		contact.UpdateContactAddress(contactId, address);
		assertTrue(ContactService.UpdateContactAddress("3", "2231 W NorthPeak way"));
	}
	
	
	
	//---------Task CRUD Test-------------

	@Test
	void CreateTaskTest() {
		TaskService task = new TaskService();
		task.CreateTask(taskId, taskName, taskInfo);
		assertTrue(TaskService.CreateTask("2", "Read", "read Junit book and gain the power"));
		assertTrue(TaskService.CreateTask("3", "Sleep", "rest the mind to refresh the next day"));
		assertTrue(TaskService.CreateTask("4", "Eat", "I need nourishment"));
		
	}

	@Test
	void UpdateTaskNameTest() {
		TaskService task = new TaskService();
		task.UpdateTaskName(taskId, taskName);
		assertTrue(TaskService.UpdateTaskName("1", "Programming"));
		
	}
	@Test
	void UpdateTaskInfoTest() {
		TaskService task = new TaskService();
		task.UpdateTaskInfo(taskId, taskInfo);
		assertTrue(TaskService.UpdateTaskInfo("1","need to get better in coding"));
	}
	@Test
	void DeleteTaskTest() {
		TaskService task = new TaskService();
		ContactService contact = new ContactService();
		AppointmentService appointment = new AppointmentService();
		//assertNotNull(task.DeleteTask("2"));
		task.DeleteTask("2");
		contact.DeleteContact("1");
		appointment.DeleteApp("3");
		
		
	}
	
	//--------Appointment CRUD test-------
	
//	@Test
//	void DateGenerateTest() {
//		
//	}
	
	@Test
	void CreateAppointmentTest() {
		AppointmentService app = new AppointmentService();
		app.CreateApp(appointmentId, appointmentInfo, appDate);
		assertTrue(AppointmentService.CreateApp("2", "Doctor Appointment", "10-10-2023"));
		assertTrue(AppointmentService.CreateApp("3", "dental Appointment", "01-10-2023"));
		assertTrue(AppointmentService.CreateApp("4", "Vision Appointment", "09-20-2023"));
	}
	
	@Test 
	void UpdateAppointmentInfoTest() {
		AppointmentService appointment = new AppointmentService();
		appointment.UpdateAppInfo(appointmentId, appointmentInfo);
		assert(AppointmentService.UpdateAppInfo("4", "Appointment for Advising"));
		
		
	}
	@Test 
	void UpdateAppointmentTest() {
		AppointmentService appointment = new AppointmentService();
		appointment.UpdateAppDate(appointmentId, appDate);
		assertTrue(AppointmentService.UpdateAppDate("4", "07-01-2023"));
		
		
		
	}
	

}

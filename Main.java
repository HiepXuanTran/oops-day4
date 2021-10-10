import java.util.List;
import java.util.Scanner;

import DTO.Worker;
import service.WorkerService;
import service.WorkerServiceInterface;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		WorkerServiceInterface logicService = new WorkerService();
		List<Worker> workers = logicService.insert(scanner);
		logicService.Delete(workers, scanner);
		logicService.Show(workers);
	}

}

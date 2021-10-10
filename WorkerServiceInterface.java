package service;

import java.util.List;
import java.util.Scanner;

import DTO.Worker;

public interface WorkerServiceInterface {
	List<Worker> insert(Scanner scanner);

	void Show(List<Worker> workers);

	void Delete(List<Worker> workers, Scanner scanner);
}

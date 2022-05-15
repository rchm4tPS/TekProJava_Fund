/*
 * Practice #12- Programming Technique Assert
 *  
 * 
 * In this exercise, we will learn about assert statement (Java assertions) using several codes below as a case.
 * 
 * QUESTS
 * 1. How to display custom message of assertion using command line? 
 * 2. How to display custom message of assertion ONLY for Researcher Roles Class using command line?
 * 3. Is it possible to show all custom message of assertions? If it is possible how to do it?
 *    - OR - 
 *    Is it ONLY possible to show custom message of the assertion that was first discovered (assertion in the earlier line)? WHY?
 * 4. Update Engineer Tools Class using EXCEPTION (Try-Catch) with "AssertionError" and show the message!
 * 5. FIX the codes, make sure you don't have any error!
 *    Take a look to Engineer Tools Class. We want to remove selected elements of array list.
 *    If the assertion is ENABLED, removing elements of array list WORKS PERFECTLY. 
 *    BUT if the assertion is DISABLED, the elements of array list are NOT REMOVED. WHY?
 *    The elements of array list should be able to be removed with both the ENABLED and DISABLED assertion. How to FIX the issue? Give your solution!
 * 6. At line 38, remove the package comment.
 *    Create nested packages according to the codes at the line. 
 *    Then execute file DataRoles.java using the java command accompanied by an "assertion parameter for the package".
 * Don't forget to provide a comprehensive explanation for each number!
 * 
 * INITIAL OUTPUT
 * $ java DataRoles
 * They are a very specialized type of backend software engineer focusing on leveraging data. They operationlize and put predictive models into production, building pipelines, api and training models.
 * [Docker, Kubernetes, OpenShift, Tableau, MongoDB, ElasticSearch, Spark, TensorFlow, PyTorch]
 * 
 * SAMPLE ASSERTION ERROR OUTPUT
 * Exception in thread "main" java.lang.AssertionError: Data Ops is invalid research role
 *      at ResearcherRoles.displayRoleDesc(DataRoles.java:XX)
 *      at DataRoles.main(DataRoles.java:XX)
 * 
 * REFERENCES
 * Main: https://www3.ntu.edu.sg/home/ehchua/programming/java/J5a_ExceptionAssert.html
 * Description: https://medium.com/analytics-and-data/an-introduction-to-18-roles-in-the-data-ecosystem-d80d88fcbec7
 */

package id.ac.polban.jtk;

import java.util.ArrayList;
import java.util.Arrays;


class DataRoles {
	public static void main(String[] args) {
        EngineerRoles EngRole = new EngineerRoles();
        ResearcherRoles ResRole = new ResearcherRoles();

        EngRole.setRole("Data Oops");
        EngRole.getRole();
        try {
        	EngRole.displayRoleDesc();
        } catch (AssertionError ae) {
        	// print out the error message to the console view
        	// from method displayRoleDesc when it encounters AssertionError
        	System.out.println(ae.getMessage());
        }

        ResRole.setRole("Data Engineer");
        ResRole.getRole();
        try {
        	ResRole.displayRoleDesc();
		} catch (AssertionError ae) {
			// print out the error message to the console view
        	// from method displayRoleDesc when it encounters AssertionError
			System.out.println(ae.getMessage());
		}

        EngRole.setRole("Machine Learning Engineer");
        EngRole.getRole();
        try {
        	EngRole.displayRoleDesc();
		} catch (AssertionError ae) {
			// print out the error message to the console view
        	// from method displayRoleDesc when it encounters AssertionError
			System.out.println(ae.getMessage());
		}

        EngineerTools EngTools = new EngineerTools();
        EngTools.removeDataOpsTools();
        EngTools.displayDataOpsTools();
    }
}

class EngineerRoles {
    String EngRole = null;
    
    void setRole(String EngRole) {
        this.EngRole = EngRole;
    }

    String getRole() {
        return this.EngRole; 
    }

	void displayRoleDesc() {
        switch (EngRole) {
            case "Data Engineer":
              System.out.println("Their core function is in the ingestion, structuring and standardization and processing of data. Their role has evolved quite a lot over the past few years and now involves dealing with both analytical and production systems.");
              break;
            case "Machine Learning Engineer":
              System.out.println("They are a very specialized type of backend software engineer focusing on leveraging data. They operationlize and put predictive models into production, building pipelines, api and training models.");
              break;
            case "Product Analyst":
              System.out.println("Product Analyst help define the strategic direction for product development by pushing for data driven decision making. They are in charge of estimating the potential impact of the product components, analysing user behaviour data, working for the engineering team to setup and analyze A/B tests, setup goals and tracking the performance against these goals. Their toolset mainly consists of SQL and Dashboarding tools, but may involve more advanced technologies or leveraging tools such as google analytics.");
              break;
            case "Data Product Owner":
              System.out.println("Data Product Owner help organize the overall direction of products leveraging data. They help define the different requirements, own the product roadmap, liaise with stakeholders as well as tackle some project management tasks, such coordinating the acquisition of the necessary training data for a Machine Learning project.");
              break;
            case "Data Vizualization Engineer":
              System.out.println("Data Vizualization Engineer make data looks beautiful. They typically work as part of a product team setting up dashboard within applications. They typically leverage Javascript for this purpose, using libraries such as D3js, VisGL and leafletJS.");
              break;
            case "Data Ops":
              System.out.println("Data Ops help setup the data infrastructure, help handle code deployment, setup data quality checks and alerting & monitoring for the different flows.");
              break;
            default:
              assert false: EngRole + " is invalid engineer role";
        }
	}
}

class ResearcherRoles {
    String ResRole = null;
    
    void setRole(String ResRole) {
        this.ResRole = ResRole;
    }

    String getRole() {
        return this.ResRole; 
    }

	void displayRoleDesc() {
        switch (ResRole) {
            case "Research Scientist":
              System.out.println("Research Scientist deep dives complicated problems, which may or may not have a direct business outcome. Think of them as sowing the seed to what will become future products. Think of image classification before it became mainstream and implemented in products, or people working on testing new deep neural network architectures.");
              break;
            case "Statistician":
              System.out.println("Statisticians can help answer more complex questions with statistical rigour. This is the case in biostatistics where statisticians can help in designing and analyzing clinical trials and help provide the regulatory submissions.");
              break;
            case "Economist":
              System.out.println("Economists work on leveraging data and economic theory for the good of companies. That can involve designing auction systems for ads, or working on predicting economic trends for risk assessment and capital allocation.");
              break;
            default:
              assert false: ResRole + " is invalid research role";
        }
	}
}

class EngineerTools {
    ArrayList<String> EngTools;
    ArrayList<String> DataOpsTools;

    EngineerTools() {
        this.EngTools = new ArrayList<>(Arrays.asList(
                                            "Docker", "Kubernetes", "OpenShift", 
                                            "Tableau", "MongoDB", "ElasticSearch", 
                                            "Spark", "TensorFlow", "PyTorch"
                                            )
                                        );
        this.DataOpsTools = new ArrayList<>(Arrays.asList("Docker", "Kubernetes", "OpenShift"));
        // this.DataOpsTools = new ArrayList<>(Arrays.asList("Pandas"));
    }

    void removeDataOpsTools() {
    	// using try and catch block here to ensure that removeAll process
    	// from ArrayList can catch the error that may arise when removeAll
    	// method are used here.
        try {
        	// assert this.EngTools.removeAll(this.DataOpsTools): "Failed to remove!";
        	boolean checkingResult = this.EngTools.removeAll(this.DataOpsTools);
        	assert (checkingResult) : "Failed to remove!";
		} catch (AssertionError e) {
			System.out.println(e.getMessage());
		}
    }

    void displayDataOpsTools() {
      System.out.println(Arrays.toString(this.EngTools.toArray()));
    }
}
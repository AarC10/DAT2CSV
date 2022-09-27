package files;

import java.io.File;

public class WorkingDir {
	private File workingDir = null;

	private File tempDir = null;

	//private DatCon datCon;

	private String userHome;

	// private LoggingPanel log;

	public static WorkingDir instance;


	private File makeDir(String dirName) {
		File theDir = new File(userHome + "/" + dirName);
		if (!theDir.exists()) {
			try {
				boolean result = theDir.mkdir();
				if (result) {
					DatConLog.Log("Created working Dir "
							+ theDir.getAbsolutePath());
				} else {
					DatConLog.Error("Can't create working Dir "
							+ theDir.getAbsolutePath());
					return null;
				}
			} catch (SecurityException se) {
				DatConLog.Exception(se);
				return null;
			}
		}
		return theDir.getAbsoluteFile();
	}

	public File getWorkingDir() {
		return workingDir;
	}

	public String getWorkingDirName() {
		if (workingDir != null) {
			return workingDir.getAbsolutePath();
		} else
			return null;
	}

	public String getTempDirName() {
		if (tempDir != null) {
			return tempDir.getAbsolutePath();
		} else
			return null;
	}

	public File getTempDir() {
		return tempDir;
	}
}

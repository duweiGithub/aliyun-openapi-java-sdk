/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeSendFileResultsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSendFileResultsResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private Long pageNumber;

	private Long pageSize;

	private List<Invocation> invocations;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<Invocation> getInvocations() {
		return this.invocations;
	}

	public void setInvocations(List<Invocation> invocations) {
		this.invocations = invocations;
	}

	public static class Invocation {

		private String invokeId;

		private String name;

		private String description;

		private String targetDir;

		private String contentType;

		private String content;

		private String fileOwner;

		private String fileGroup;

		private String fileMode;

		private String overwrite;

		private Integer vmCount;

		private String creationTime;

		private String invocationStatus;

		private List<InvokeInstance> invokeInstances;

		public String getInvokeId() {
			return this.invokeId;
		}

		public void setInvokeId(String invokeId) {
			this.invokeId = invokeId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getTargetDir() {
			return this.targetDir;
		}

		public void setTargetDir(String targetDir) {
			this.targetDir = targetDir;
		}

		public String getContentType() {
			return this.contentType;
		}

		public void setContentType(String contentType) {
			this.contentType = contentType;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getFileOwner() {
			return this.fileOwner;
		}

		public void setFileOwner(String fileOwner) {
			this.fileOwner = fileOwner;
		}

		public String getFileGroup() {
			return this.fileGroup;
		}

		public void setFileGroup(String fileGroup) {
			this.fileGroup = fileGroup;
		}

		public String getFileMode() {
			return this.fileMode;
		}

		public void setFileMode(String fileMode) {
			this.fileMode = fileMode;
		}

		public String getOverwrite() {
			return this.overwrite;
		}

		public void setOverwrite(String overwrite) {
			this.overwrite = overwrite;
		}

		public Integer getVmCount() {
			return this.vmCount;
		}

		public void setVmCount(Integer vmCount) {
			this.vmCount = vmCount;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getInvocationStatus() {
			return this.invocationStatus;
		}

		public void setInvocationStatus(String invocationStatus) {
			this.invocationStatus = invocationStatus;
		}

		public List<InvokeInstance> getInvokeInstances() {
			return this.invokeInstances;
		}

		public void setInvokeInstances(List<InvokeInstance> invokeInstances) {
			this.invokeInstances = invokeInstances;
		}

		public static class InvokeInstance {

			private String instanceId;

			private String invocationStatus;

			private String creationTime;

			private String startTime;

			private String finishTime;

			private String updateTime;

			private String errorCode;

			private String errorInfo;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getInvocationStatus() {
				return this.invocationStatus;
			}

			public void setInvocationStatus(String invocationStatus) {
				this.invocationStatus = invocationStatus;
			}

			public String getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(String creationTime) {
				this.creationTime = creationTime;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getFinishTime() {
				return this.finishTime;
			}

			public void setFinishTime(String finishTime) {
				this.finishTime = finishTime;
			}

			public String getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(String updateTime) {
				this.updateTime = updateTime;
			}

			public String getErrorCode() {
				return this.errorCode;
			}

			public void setErrorCode(String errorCode) {
				this.errorCode = errorCode;
			}

			public String getErrorInfo() {
				return this.errorInfo;
			}

			public void setErrorInfo(String errorInfo) {
				this.errorInfo = errorInfo;
			}
		}
	}

	@Override
	public DescribeSendFileResultsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSendFileResultsResponseUnmarshaller.unmarshall(this, context);
	}
}

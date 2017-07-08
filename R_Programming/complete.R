complete <- function(directory, id = 1:332) {
  ## 'directory' is a character vector of length 1 indicating the location of
  ## the CSV files
  
  ## 'id' is an integer vector indicating the monitor ID numbers to be used
    files_complete <- list.files(directory, full.names = TRUE)
    file_c_list <- c(id)
    file_value_list <- c()
    increment <- 1
    for (file in id)
    {
      place_holder <- read.csv(files_complete[file])
      file_value_list[increment] <- nrow(na.omit(place_holder))
      increment <- increment + 1 
    }
    data_with_info <- data.frame(id = file_c_list, nobs = file_value_list)
    data_with_info
}
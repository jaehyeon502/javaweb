import React from 'react'
//? Box 컴포넌트 : mui에서 공간을 할당하는 모든 태그를 포함
//? Grid 컴포넌트 : mui에서 공간을 12등분하여 가로 사이즈에 따라 반응형 웹 개발을 지원
import { Box , Grid} from '@mui/material'

export default function LoginView() {
  return (
    <Box>
        <Grid container spacing={2}>
            <Grid item lg={7} sm={12}>
                <Box height={"400px"} sx={{backgroundColor:"red"}}></Box>
            </Grid>
            <Grid item lg={5} sm={12}>
            <Box height={"400px"} sx={{backgroundColor:"black"}}></Box>
            </Grid>
        </Grid>
    </Box>
  )
}

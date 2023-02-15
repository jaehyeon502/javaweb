import React from 'react'
import { Avatar, Box, Typography } from '@mui/material';

export default function BoardListItem() {
  return (
    <Box sx={{ p: '24px', backgroundColor: '#ffffff' }}>
      <Box>
        <Box sx={{ display: 'flex' }}>
          <Box sx={{ mr: '8px' }}>
            <Avatar alt="Remy Sharp" src="/static/images/avatar/1.jpg" />
          </Box>
          <Box>
            <Typography sx={{ fontSize: '12px', fontWeight: '500', color: '#666' }}>Nickname</Typography>
            <Typography sx={{ mt: '2px', fontSize: '12px', fontWeight: '400', color: 'rgba(0,0,0,0.5)' }}>2023. 02. 15.</Typography>
          </Box>
        </Box>
        <Box sx={{ mt: '16px', mb: '16px' }}>
          <Typography sx={{ fontSize: '16px', fontWeight: '500', color: '#000' }}>Title</Typography>
          <Typography sx={{ mt: '5px', fontSize: '12px', fontWeight: '400', color: 'rgba(0,0,0,0.5)' }}>Contents</Typography>
        </Box>
        <Box>
          <Typography sx={{ fontSize: '12px', fontWeight: '400', color: 'rgba(0,0,0,0.5)' }}>{`댓글 0 · 좋아요 0 · 조회수 0`}</Typography>
        </Box>
      </Box>
      <Box>
        {/* 이미지 들어올 공간 */}
      </Box>
    </Box>
  )
}
